package com.atakankuloglu.arabamcomsample.ui.view.cardetail

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.lifecycle.ViewModelProvider
import com.atakankuloglu.arabamcomsample.databinding.ActivityCarDetailBinding
import com.atakankuloglu.arabamcomsample.databinding.ActivityCarListBinding
import com.atakankuloglu.arabamcomsample.model.CarListModel
import com.atakankuloglu.arabamcomsample.ui.adapter.CarListAdapter
import com.atakankuloglu.arabamcomsample.ui.view.carlist.CarListViewModel
import com.atakankuloglu.arabamcomsample.util.ItemClickListener

class CarDetailActivity : AppCompatActivity(){

    private lateinit var binding: ActivityCarDetailBinding
    private lateinit var viewModel: CarDetailViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setupViewBinding()
        setupViewModel()
        getArgs()
    }

    private fun getArgs() {
        intent?.getStringExtra("data")?.let { _brandName ->
            binding.brand.text = _brandName
        }
    }

    private fun setupViewModel() {
        viewModel = ViewModelProvider(this).get(CarDetailViewModel::class.java)
    }

    private fun setupViewBinding() {
        binding = ActivityCarDetailBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }

}