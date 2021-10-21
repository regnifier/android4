package com.example.cinema12345.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.cinema12345.R
import com.example.cinema12345.glide.GlideApp
import com.example.cinema12345.model.Movie

class MovieAdapter: RecyclerView.Adapter<MovieAdapter.MoviewViewHolder>() {

    private var movies: List<Movie> = listOf()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MoviewViewHolder {
        return MoviewViewHolder.from(parent)
    }

    override fun onBindViewHolder(holder: MoviewViewHolder, position: Int) {
        val movie = movies[position]
        holder.bind(movie)
    }

    fun setMovies(movies: List<Movie>){
        this.movies = movies
        notifyDataSetChanged()
    }

    override fun getItemCount(): Int = movies.size

    class MoviewViewHolder(itemView: View): RecyclerView.ViewHolder(itemView){

       private val tvTitle: TextView =  itemView.findViewById(R.id.tvTitle)
        private val tvRelease: TextView =  itemView.findViewById(R.id.tvReleaseDate)
        private val tvView: TextView =  itemView.findViewById(R.id.tvOverview)
        private val tvPoster: ImageView =  itemView.findViewById(R.id.tvPoster)

        fun bind(movie: Movie) {
            GlideApp.with(tvPoster)
                .load("https://image.tmdb.org/t/p/w500${movie.posterPath}")
                .into(tvPoster)
            tvTitle.text = movie.title
            tvRelease.text = movie.releaseDate
            tvView.text = movie.overview
        }


        companion object{
            fun from(parent: ViewGroup): MoviewViewHolder{
               val inflater = LayoutInflater.from(parent.context)
                val itemView = inflater.inflate(R.layout.item_movie, parent, false)
                return MoviewViewHolder(itemView)
            }
        }


    }


}