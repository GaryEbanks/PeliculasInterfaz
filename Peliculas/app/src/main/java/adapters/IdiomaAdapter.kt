package adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.peliculas.databinding.ItemIdiomaBinding
import models.IdiomaItem

class IdiomaAdapter(val idiomaLista : List<IdiomaItem>):RecyclerView.Adapter<IdiomaAdapter.IdiomaHolder>() {
    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): IdiomaHolder {
        val binding = ItemIdiomaBinding.inflate(
            LayoutInflater.from(parent.context),
            parent,
            false
        )
        return IdiomaHolder(binding)
    }

    override fun onBindViewHolder(holder: IdiomaAdapter.IdiomaHolder, position: Int) {
        holder.bind(idiomaLista[position])
    }

    override fun getItemCount(): Int = idiomaLista.size

    inner class IdiomaHolder(val binding: ItemIdiomaBinding): RecyclerView.ViewHolder(binding.root){
        fun bind(idioma: IdiomaItem){
            with(binding){
                TxtNombre.text = idioma.nombre
                TxtId.text = idioma.idIdioma.toString()
            }
        }
    }
}