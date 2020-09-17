package com.dicoding.gprionggo.transportasi;

import android.os.Parcel;
import android.os.Parcelable;

public class Transportasi implements Parcelable {
    private String nama_transportasi;
    private String detail;
    private int foto_transportasi;

    public Transportasi() {

    }

    public int getFoto_transportasi() {
        return foto_transportasi;
    }

    public void setFoto_transportasi(int foto_transportasi) {
        this.foto_transportasi = foto_transportasi;
    }

    public String getNama_transportasi() {
        return nama_transportasi;
    }

    public void setNama_transportasi(String nama_transportasi) {
        this.nama_transportasi = nama_transportasi;
    }

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }

    public int getPoto() {
        return poto;
    }

    public void setPoto(int poto) {
        this.poto = poto;
    }

    private int poto;

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(nama_transportasi);
        parcel.writeString(detail);
        parcel.writeInt(foto_transportasi);
    }

    protected Transportasi(Parcel in) {
        nama_transportasi = in.readString();
        detail = in.readString();
        foto_transportasi = in.readInt();
    }

    public static final Creator<Transportasi> CREATOR = new Creator<Transportasi>() {
        @Override
        public Transportasi createFromParcel(Parcel in) {
            return new Transportasi(in);
        }

        @Override
        public Transportasi[] newArray(int size) {
            return new Transportasi[size];
        }
    };
}
