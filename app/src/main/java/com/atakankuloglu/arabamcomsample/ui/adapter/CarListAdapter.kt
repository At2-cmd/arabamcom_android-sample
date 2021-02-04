package com.atakankuloglu.arabamcomsample.ui.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.atakankuloglu.arabamcomsample.databinding.RecyclerRowBinding
import com.atakankuloglu.arabamcomsample.model.CarListModel
import com.atakankuloglu.arabamcomsample.util.ItemClickListener

class CarListAdapter(
    private val carList: ArrayList<CarListModel>,
    private val itemClickListener: ItemClickListener
) : RecyclerView.Adapter<CarListAdapter.CarListViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CarListViewHolder {
        RecyclerRowBinding.inflate(LayoutInflater.from(parent.context), parent, false).also {
            return CarListViewHolder(it)
        }
    }

    override fun onBindViewHolder(holder: CarListViewHolder, position: Int) {
        holder.bind(carList[position])
    }

    inner class CarListViewHolder(private val binding: RecyclerRowBinding) : RecyclerView.ViewHolder(binding.root) {
        fun bind(model: CarListModel) {
            binding.apply {
                carPhoto.setImageResource(model.carPhoto)
                brandName.text = model.brandName
                modelName.text = model.modelName
                modelYear.text = model.modelYear
                rowRoot.setOnClickListener {
                    itemClickListener.onItemClick(model)
                }
            }
        }
    }

    override fun getItemCount(): Int {
        return carList.size
    }
}