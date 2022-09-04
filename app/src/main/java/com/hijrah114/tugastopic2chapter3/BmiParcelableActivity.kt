package com.hijrah114.tugastopic2chapter3

import android.os.Parcel
import android.os.Parcelable

data class BmiParcelableActivity(
    val umur: Int,
    val tinggi: Int,
    val berat: Int,
    val bmi: Double,
    val kategori: String?
): Parcelable {
    constructor(parcel: Parcel) : this(
        parcel.readInt(),
        parcel.readInt(),
        parcel.readInt(),
        parcel.readDouble(),
        parcel.readString()
    ) {
    }

    override fun writeToParcel(parcel: Parcel, flags: Int) {
        parcel.writeInt(umur)
        parcel.writeInt(tinggi)
        parcel.writeInt(berat)
        parcel.writeDouble(bmi)
        parcel.writeString(kategori)
    }

    override fun describeContents(): Int {
        return 0
    }

    companion object CREATOR : Parcelable.Creator<BmiParcelableActivity> {
        override fun createFromParcel(parcel: Parcel): BmiParcelableActivity {
            return BmiParcelableActivity(parcel)
        }

        override fun newArray(size: Int): Array<BmiParcelableActivity?> {
            return arrayOfNulls(size)
        }
    }
}