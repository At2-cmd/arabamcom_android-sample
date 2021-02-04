package com.atakankuloglu.arabamcomsample.model

import com.atakankuloglu.arabamcomsample.R

data class CarModel(
    val carPhoto: Int,
    val brandName: String,
    val modelName: String,
    val modelYear: String
)

object MockList {

    fun getMockedArabalarListesi(): ArrayList<CarModel> {

        val carModel = CarModel(
            R.drawable.latitude,
            "Renault",
            "Latitude",
            "2017"
        )
        return arrayListOf(carModel)

    }
}
