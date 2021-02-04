package com.atakankuloglu.arabamcomsample.ui.view.carlist

import ArabalarlarAdapter
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import com.atakankuloglu.arabamcomsample.R
import com.atakankuloglu.arabamcomsample.databinding.ActivityCarListBinding
import com.atakankuloglu.arabamcomsample.model.CarModel
import com.atakankuloglu.arabamcomsample.model.MockList

import kotlinx.android.synthetic.main.activity_car_list.*

class CarListActivity : AppCompatActivity() {

    private lateinit var binding: ActivityCarListBinding
    private lateinit var viewModel: CarListViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setupViewBinding()
        setupViewModel()

        recyclerView1.layoutManager = LinearLayoutManager(this)
        recyclerView1.adapter = ArabalarlarAdapter(MockList.getMockedArabalarListesi())


    }

    private fun setupViewModel() {
        viewModel = ViewModelProvider(this).get(CarListViewModel::class.java)
    }

    private fun setupViewBinding() {
        binding = ActivityCarListBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }


}