package com.atakankuloglu.arabamcomsample.ui.view.carlist

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.ViewModelProvider
import com.atakankuloglu.arabamcomsample.databinding.ActivityCarListBinding
import com.atakankuloglu.arabamcomsample.model.CarListModel
import com.atakankuloglu.arabamcomsample.ui.adapter.CarListAdapter
import com.atakankuloglu.arabamcomsample.ui.view.cardetail.CarDetailActivity
import com.atakankuloglu.arabamcomsample.util.ItemClickListener

class CarListActivity : AppCompatActivity(){

    private lateinit var binding: ActivityCarListBinding
    private lateinit var viewModel: CarListViewModel

    private lateinit var carListAdapter: CarListAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setupViewBinding()
        setupViewModel()
        initObservers()
        viewModel.prepareMockData()
    }

    private fun initObservers() {
        viewModel.apply {
            carMockList.observe(this@CarListActivity, {
                initAdapter()
            })
        }
    }

    private fun initAdapter() {
        carListAdapter = CarListAdapter(
            carList = viewModel.carMockList.value ?: arrayListOf(),
            itemClickListener = object : ItemClickListener {
                override fun onItemClick(model: CarListModel) {
                    navigateToCarDetail(model)
                }
            }
        )
        binding.rvCarList.adapter = carListAdapter
    }

    private fun navigateToCarDetail(model: CarListModel) {
        Intent(this@CarListActivity, CarDetailActivity::class.java).apply {
            putExtra("data", model.brandName)
        }.also { _intent ->
            startActivity(_intent)
        }
    }


    private fun setupViewModel() {
        viewModel = ViewModelProvider(this).get(CarListViewModel::class.java)
    }

    private fun setupViewBinding() {
        binding = ActivityCarListBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }

}