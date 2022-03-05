package com.faszztrack.myrecycleerview

class ModelSepeda(nama: String?, jenis: String?) {
    private var nama: String
    private var jenis: String

    init {
        this.nama = nama!!
        this.jenis = jenis!!

    }
    fun getNama(): String {
        return nama
    }
    fun  setNama(nama: String?){
        this.nama = nama!!
    }

    fun getJenis(): String? {
        return jenis
    }
    fun setJenis(jenis: String?) {
        this.jenis = jenis!!
    }
}
