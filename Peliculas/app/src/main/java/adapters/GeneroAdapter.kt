package adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.peliculas.databinding.ItemGeneroBinding
import models.GeneroItem

class GeneroAdapter(val generoLista : List<GeneroItem>): RecyclerView.Adapter<GeneroAdapter.GeneroHolder>() {
    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): GeneroHolder {
        val binding = ItemGeneroBinding.inflate(
            LayoutInflater.from(parent.context),
            parent,
            false
        )
        return GeneroHolder(binding)
    }

    override fun onBindViewHolder(holder: GeneroAdapter.GeneroHolder, position: Int) {
        holder.bind(generoLista[position])
    }

    override fun getItemCount(): Int = generoLista.size

    inner class GeneroHolder(val binding: ItemGeneroBinding): RecyclerView.ViewHolder(binding.root){
        fun bind(genero: GeneroItem){
            with(binding){
                TxtId.text = genero.idGenero.toString()
                TxtNombre.text = genero.nombre
            }
        }
    }
}