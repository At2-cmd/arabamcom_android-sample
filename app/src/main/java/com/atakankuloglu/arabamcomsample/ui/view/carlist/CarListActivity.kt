package com.atakankuloglu.arabamcomsample.ui.view.carlist

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.ViewModelProvider
import com.atakankuloglu.arabamcomsample.R
import com.atakankuloglu.arabamcomsample.databinding.ActivityCarListBinding

class CarListActivity : AppCompatActivity() {

    private lateinit var binding: ActivityCarListBinding
    private lateinit var viewModel: CarListViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setupViewBinding()
        setupViewModel()


    }

    private fun setupViewModel() {
        viewModel = ViewModelProvider(this).get(CarListViewModel::class.java)
    }

    private fun setupViewBinding() {
        binding = ActivityCarListBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }


}