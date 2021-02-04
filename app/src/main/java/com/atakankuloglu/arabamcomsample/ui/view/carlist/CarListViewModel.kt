package com.atakankuloglu.arabamcomsample.ui.view.carlist

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.atakankuloglu.arabamcomsample.R
import com.atakankuloglu.arabamcomsample.model.CarListModel

class CarListViewModel : ViewModel() {

    val carMockList = MutableLiveData<ArrayList<CarListModel>>()

    fun prepareMockData() {
        arrayListOf<CarListModel>().apply {
            add(
                CarListModel(
                    R.drawable.latitude,
                    "BMW",
                    "M4 Competition",
                    "2021"
                )
            )
            add(
                CarListModel(
                    R.drawable.latitude,
                    "Mercedes-Benz",
                    "C180 AMG",
                    "2018"
                )
            )
            add(
                CarListModel(
                    R.drawable.latitude,
                    "Mercedes-Benz",
                    "C180 AMG",
                    "2018"
                )
            )
            add(
                CarListModel(
                    R.drawable.latitude,
                    "Mercedes-Benz",
                    "C180 AMG",
                    "2018"
                )
            )
            add(
                CarListModel(
                    R.drawable.latitude,
                    "Mercedes-Benz",
                    "C180 AMG",
                    "2018"
                )
            )
            add(
                CarListModel(
                    R.drawable.latitude,
                    "Mercedes-Benz",
                    "C180 AMG",
                    "2018"
                )
            )
            add(
                CarListModel(
                    R.drawable.latitude,
                    "Mercedes-Benz",
                    "C180 AMG",
                    "2018"
                )
            )
            add(
                CarListModel(
                    R.drawable.latitude,
                    "Mercedes-Benz",
                    "C180 AMG",
                    "2018"
                )
            )
            add(
                CarListModel(
                    R.drawable.latitude,
                    "Mercedes-Benz",
                    "C180 AMG",
                    "2018"
                )
            )
        }.also { _mockList ->
            carMockList.value = _mockList
        }
    }
}