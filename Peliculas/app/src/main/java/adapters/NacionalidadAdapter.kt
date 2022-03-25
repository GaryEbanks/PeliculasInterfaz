package adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.peliculas.databinding.ItemNacionalidadBinding
import models.NacionalidadItem

class NacionalidadAdapter(val nacionalidadList: List<NacionalidadItem>):RecyclerView.Adapter<NacionalidadAdapter.NacionalidadHolder>() {
    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): NacionalidadHolder {
        val binding = ItemNacionalidadBinding.inflate(
            LayoutInflater.from(parent.context),
            parent,
            false
        )
        return NacionalidadHolder(binding)
    }

    override fun onBindViewHolder(holder: NacionalidadAdapter.NacionalidadHolder, position: Int) {
        holder.bind(nacionalidadList[position])
    }

    override fun getItemCount(): Int = nacionalidadList.size

    inner class NacionalidadHolder(val binding: ItemNacionalidadBinding):RecyclerView.ViewHolder(binding.root){
        fun bind(nacionalidad: NacionalidadItem){
            with(binding){
                TxtNombre.text = nacionalidad.nombre
                TxtId.text = nacionalidad.idNacionalidad.toString()
            }
        }
    }
}