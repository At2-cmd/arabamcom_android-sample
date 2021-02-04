import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.atakankuloglu.arabamcomsample.ArabaViewHolder
import com.atakankuloglu.arabamcomsample.model.CarModel

class ArabalarlarAdapter(val arabalarListesi: List<CarModel>) :
    RecyclerView.Adapter<ArabaViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ArabaViewHolder {
        return ArabaViewHolder(parent)
    }

    override fun getItemCount(): Int {
        return arabalarListesi.size
    }

    override fun onBindViewHolder(holder: ArabaViewHolder, position: Int) {
        holder.bind(arabalarListesi[position])

    }
}