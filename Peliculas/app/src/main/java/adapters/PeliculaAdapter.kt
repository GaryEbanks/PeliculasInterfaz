package adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.peliculas.databinding.ItemPeliculaBinding
import models.PeliculaItem

class PeliculaAdapter(val peliculaLista : List<PeliculaItem>):RecyclerView.Adapter<PeliculaAdapter.PeliculaHolder>() {
    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): PeliculaAdapter.PeliculaHolder {
        val binding = ItemPeliculaBinding.inflate(
            LayoutInflater.from(parent.context),
            parent,
            false
        )
        return PeliculaHolder(binding)
    }

    override fun onBindViewHolder(holder: PeliculaAdapter.PeliculaHolder, position: Int) {
        holder.bind(peliculaLista[position])
    }

    override fun getItemCount(): Int = peliculaLista.size

    inner class PeliculaHolder(val binding: ItemPeliculaBinding): RecyclerView.ViewHolder(binding.root){
        fun bind(pelicula: PeliculaItem){
            with(binding){
                TxtId.text = pelicula.idPelicula.toString()
                TxtTitulo.text = pelicula.titulo
                TxtTipoMetraje.text = pelicula.tipoMetraje
                TxtNacionalidad.text = pelicula.nacionalidad.toString()
                TxtClasificacion.text = pelicula.clasificacion.toString()
                TxtDuracion.text = pelicula.duracion
                TxtSinopsis.text = pelicula.sinopsis
            }
        }
    }
}