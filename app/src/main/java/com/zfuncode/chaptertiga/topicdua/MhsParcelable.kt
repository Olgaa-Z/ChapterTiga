package com.zfuncode.chaptertiga.topicdua

import android.os.Parcel
import android.os.Parcelable

data class MhsParcelable(val name: String?, val nim: String?, var jurusan: String?) : Parcelable {
    constructor(parcel: Parcel) : this(
        parcel.readString(),
        parcel.readString(),
        parcel.readString()
    ) {
    }

    override fun writeToParcel(parcel: Parcel, flags: Int) {
        parcel.writeString(name)
        parcel.writeString(nim)
        parcel.writeString(jurusan)
    }

    override fun describeContents(): Int {
        return 0
    }

    companion object CREATOR : Parcelable.Creator<MhsParcelable> {
        override fun createFromParcel(parcel: Parcel): MhsParcelable {
            return MhsParcelable(parcel)
        }

        override fun newArray(size: Int): Array<MhsParcelable?> {
            return arrayOfNulls(size)
        }
    }
}
