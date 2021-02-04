package com.atakankuloglu.arabamcomsample

import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.cardview.widget.CardView
import androidx.recyclerview.widget.RecyclerView
import com.atakankuloglu.arabamcomsample.model.CarModel
import kotlinx.android.synthetic.main.recycler_row.view.*

class ArabaViewHolder(container: ViewGroup) : RecyclerView.ViewHolder(
    LayoutInflater.from(container.context).inflate(R.layout.recycler_row, container, false)
) {
    val crdView: CardView = itemView.findViewById(R.id.cardview1)
    val photo: ImageView = itemView.findViewById(R.id.CarPhoto)
    val brand: TextView = itemView.findViewById(R.id.BrandName)
    val model: TextView = itemView.findViewById(R.id.ModelName)
    val year: TextView = itemView.findViewById(R.id.ModelYear)


    fun bind(carModel: CarModel) {

        photo.setImageResource(carModel.carPhoto)
        brand.text = carModel.brandName
        model.text = carModel.modelName
        year.text = carModel.modelYear
    }
}