package adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.peliculas.databinding.ItemClasificacionBinding
import models.ClasificacionItem

class ClasificacionAdapter(val clasificacionLista : List<ClasificacionItem>):RecyclerView.Adapter<ClasificacionAdapter.ClasificacionHolder> (){
    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): ClasificacionHolder {
        val binding = ItemClasificacionBinding.inflate(
            LayoutInflater.from(parent.context),
            parent,
            false
        )
        return ClasificacionHolder(binding)
    }

    override fun onBindViewHolder(holder: ClasificacionAdapter.ClasificacionHolder, position: Int) {
        holder.bind(clasificacionLista[position])
    }

    override fun getItemCount(): Int = clasificacionLista.size

    inner class ClasificacionHolder(val binding: ItemClasificacionBinding): RecyclerView.ViewHolder(binding.root){
        fun bind(clasificacion: ClasificacionItem){
            with(binding){
                TxtAbreviacion.text = clasificacion.abrevaviacion
                TxtId.text = clasificacion.idClasificacion.toString()
                TxtNombre.text = clasificacion.nombre
            }
        }
    }

}

