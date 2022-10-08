package com.example.melinehflixster



import android.os.Bundle
import android.provider.ContactsContract.CommonDataKinds.Im
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.bumptech.glide.Glide

private const val TAG = "DetailActivity"

class MovieDetailActivity : AppCompatActivity() {
    private lateinit var mediaImageView: ImageView
    private lateinit var titleTextView: TextView
    private lateinit var bylineTextView: TextView
    private lateinit var abstractTextView: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)

        /*
        val backdropView = findViewById<ImageView>(R.id.backdropV)
        val releaseView = findViewById<TextView>(R.id.releaseV)
        val voteView = findViewById<TextView>(R.id.ratingV)

        // TODO: Get the extra from the Intent
        val mybackdrop = getIntent().getStringExtra("extraPath")
        val mydate = getIntent().getStringExtra("extraDate")
        val myvote = getIntent().getStringExtra("extraRating")

        // TODO: Set the title, byline, and abstract information from the article

        releaseView.setText(mydate)
        voteView.setText(myvote)

        // TODO: Load the media image
        Glide.with(this)
            .load("https://image.tmdb.org/t/p/w500/" + mybackdrop)
            .centerInside()
            .into(backdropView)
            */
    }
}