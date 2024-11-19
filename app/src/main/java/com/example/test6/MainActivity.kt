package com.example.test6


import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast

lateinit var btnWelcome : TextView
lateinit var txtQ1 : TextView
lateinit var imgSch: ImageView
lateinit var imgBag: ImageView
lateinit var imgBag1:ImageView
lateinit var imgHat: ImageView
lateinit var imgHat1: ImageView
lateinit var imgShose: ImageView
lateinit var imgshoes1: ImageView
lateinit var imgglass: ImageView
lateinit var imgglashome: ImageView
lateinit var txtBag1: TextView
lateinit var txtBags: TextView
lateinit var txtHats: TextView
lateinit var txtHat1: TextView
lateinit var txtShose: TextView
lateinit var txtShose1: TextView
lateinit var txtglasses: TextView
lateinit var txtglasses1: TextView



class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val layoutResId = intent.getIntExtra(
            "layout",
            R.layout.activity_welcome
        )
        setContentView(layoutResId)

        if(layoutResId == R.layout.activity_welcome){
            btnWelcome = findViewById(R.id.btnWelcome)
            btnWelcome.setOnClickListener {
//            Toast.makeText(this, "Answer", Toast.LENGTH_LONG).show()
                val intent = Intent(this, MainActivity::class.java).apply {
                    putExtra("layout", R.layout.activity_login)
                }
                startActivity(intent)
                finish()
            }
        }
        if(layoutResId == R.layout.activity_login){
            txtQ1 = findViewById(R.id.txtQ1)
            txtQ1.setOnClickListener {
//            Toast.makeText(this, "Answer", Toast.LENGTH_LONG).show()
                val intent = Intent(this, MainActivity::class.java).apply {
                    putExtra("layout", R.layout.activity_signup)
                }
                startActivity(intent)
                finish()
            }
        }

        if(layoutResId == R.layout.activity_login){
            btnWelcome = findViewById(R.id.btnWelcome)
            btnWelcome.setOnClickListener {
//            Toast.makeText(this, "Answer", Toast.LENGTH_LONG).show()
                val intent = Intent(this, MainActivity::class.java).apply {
                    putExtra("layout", R.layout.activity_home)
                }
                startActivity(intent)
                finish()
            }
        }

        if(layoutResId == R.layout.activity_signup){
            txtQ1 = findViewById(R.id.txtQ1)
            txtQ1.setOnClickListener {
//            Toast.makeText(this, "Answer", Toast.LENGTH_LONG).show()
                val intent = Intent(this, MainActivity::class.java).apply {
                    putExtra("layout", R.layout.activity_login)
                }
                startActivity(intent)
                finish()
            }
        }

        if(layoutResId == R.layout.activity_signup){
            txtQ1 = findViewById(R.id.txtQ1)
            txtQ1.setOnClickListener {
//            Toast.makeText(this, "Answer", Toast.LENGTH_LONG).show()
                val intent = Intent(this, MainActivity::class.java).apply {
                    putExtra("layout", R.layout.activity_login)
                }
                startActivity(intent)
                finish()
            }
        }

        if(layoutResId == R.layout.activity_signup){
            btnWelcome = findViewById(R.id.btnWelcome)
            btnWelcome.setOnClickListener {
//            Toast.makeText(this, "Answer", Toast.LENGTH_LONG).show()
                val intent = Intent(this, MainActivity::class.java).apply {
                    putExtra("layout", R.layout.activity_login)
                }
                startActivity(intent)
                finish()
            }
        }

        if(layoutResId == R.layout.activity_home){
            imgSch = findViewById(R.id.imgSch)
            imgSch.setOnClickListener {
//            Toast.makeText(this, "Answer", Toast.LENGTH_LONG).show()
                val intent = Intent(this, MainActivity::class.java).apply {
                    putExtra("layout", R.layout.activity_search)
                }
                startActivity(intent)
                finish()
            }
        }

        if(layoutResId == R.layout.activity_bags){
            imgSch = findViewById(R.id.imgSch)
            imgSch.setOnClickListener {
//            Toast.makeText(this, "Answer", Toast.LENGTH_LONG).show()
                val intent = Intent(this, MainActivity::class.java).apply {
                    putExtra("layout", R.layout.activity_search)
                }
                startActivity(intent)
                finish()
            }
        }

        if(layoutResId == R.layout.activity_glasses){
            imgSch = findViewById(R.id.imgSch)
            imgSch.setOnClickListener {
//            Toast.makeText(this, "Answer", Toast.LENGTH_LONG).show()
                val intent = Intent(this, MainActivity::class.java).apply {
                    putExtra("layout", R.layout.activity_search)
                }
                startActivity(intent)
                finish()
            }
        }

        if(layoutResId == R.layout.activity_shoes){
            imgSch = findViewById(R.id.imgSch)
            imgSch.setOnClickListener {
//            Toast.makeText(this, "Answer", Toast.LENGTH_LONG).show()
                val intent = Intent(this, MainActivity::class.java).apply {
                    putExtra("layout", R.layout.activity_search)
                }
                startActivity(intent)
                finish()
            }
        }

        if(layoutResId == R.layout.activity_hats){
            imgSch = findViewById(R.id.imgSch)
            imgSch.setOnClickListener {
//            Toast.makeText(this, "Answer", Toast.LENGTH_LONG).show()
                val intent = Intent(this, MainActivity::class.java).apply {
                    putExtra("layout", R.layout.activity_search)
                }
                startActivity(intent)
                finish()
            }
        }

        if(layoutResId == R.layout.activity_glasses){
            imgSch = findViewById(R.id.imgSch)
            imgSch.setOnClickListener {
//            Toast.makeText(this, "Answer", Toast.LENGTH_LONG).show()
                val intent = Intent(this, MainActivity::class.java).apply {
                    putExtra("layout", R.layout.activity_search)
                }
                startActivity(intent)
                finish()
            }
        }

        if(layoutResId == R.layout.activity_bag1){
            imgSch = findViewById(R.id.imgSch)
            imgSch.setOnClickListener {
//            Toast.makeText(this, "Answer", Toast.LENGTH_LONG).show()
                val intent = Intent(this, MainActivity::class.java).apply {
                    putExtra("layout", R.layout.activity_search)
                }
                startActivity(intent)
                finish()
            }
        }

        if(layoutResId == R.layout.activity_shose1){
            imgSch = findViewById(R.id.imgSch)
            imgSch.setOnClickListener {
//            Toast.makeText(this, "Answer", Toast.LENGTH_LONG).show()
                val intent = Intent(this, MainActivity::class.java).apply {
                    putExtra("layout", R.layout.activity_search)
                }
                startActivity(intent)
                finish()
            }
        }


        if(layoutResId == R.layout.activity_home){
            imgBag = findViewById(R.id.imgBag)
            imgBag.setOnClickListener {
//            Toast.makeText(this, "Answer", Toast.LENGTH_LONG).show()
                val intent = Intent(this, MainActivity::class.java).apply {
                    putExtra("layout", R.layout.activity_bags)
                }
                startActivity(intent)
                finish()
            }
        }


        if(layoutResId == R.layout.activity_bags){
            imgBag1 = findViewById(R.id.imgBag1)
            imgBag1.setOnClickListener {
//            Toast.makeText(this, "Answer", Toast.LENGTH_LONG).show()
                val intent = Intent(this, MainActivity::class.java).apply {
                    putExtra("layout", R.layout.activity_bag1)
                }
                startActivity(intent)
                finish()
            }
        }

        if(layoutResId == R.layout.activity_home){
            imgHat = findViewById(R.id.imgHat)
            imgHat.setOnClickListener {
//            Toast.makeText(this, "Answer", Toast.LENGTH_LONG).show()
                val intent = Intent(this, MainActivity::class.java).apply {
                    putExtra("layout", R.layout.activity_hats)
                }
                startActivity(intent)
                finish()
            }
        }

        if(layoutResId == R.layout.activity_hats){
            imgHat1 = findViewById(R.id.imgHat1)
            imgHat1.setOnClickListener {
//            Toast.makeText(this, "Answer", Toast.LENGTH_LONG).show()
                val intent = Intent(this, MainActivity::class.java).apply {
                    putExtra("layout", R.layout.activity_hat1)
                }
                startActivity(intent)
                finish()
            }
        }

        if(layoutResId == R.layout.activity_home){
            imgShose = findViewById(R.id.imgShose)
            imgShose.setOnClickListener {
//            Toast.makeText(this, "Answer", Toast.LENGTH_LONG).show()
                val intent = Intent(this, MainActivity::class.java).apply {
                    putExtra("layout", R.layout.activity_shoes)
                }
                startActivity(intent)
                finish()
            }
        }

        if(layoutResId == R.layout.activity_shoes){
            imgshoes1 = findViewById(R.id.imgshoes1)
            imgshoes1.setOnClickListener {
//            Toast.makeText(this, "Answer", Toast.LENGTH_LONG).show()
                val intent = Intent(this, MainActivity::class.java).apply {
                    putExtra("layout", R.layout.activity_shose1)
                }
                startActivity(intent)
                finish()
            }
        }

        if(layoutResId == R.layout.activity_home){
            imgglass = findViewById(R.id.imgglass)
            imgglass.setOnClickListener {
//            Toast.makeText(this, "Answer", Toast.LENGTH_LONG).show()
                val intent = Intent(this, MainActivity::class.java).apply {
                    putExtra("layout", R.layout.activity_glasses)
                }
                startActivity(intent)
                finish()
            }
        }

        if(layoutResId == R.layout.activity_glasses){
            imgglashome = findViewById(R.id.imgglashome)
            imgglashome.setOnClickListener {
//            Toast.makeText(this, "Answer", Toast.LENGTH_LONG).show()
                val intent = Intent(this, MainActivity::class.java).apply {
                    putExtra("layout", R.layout.activity_glasses1)
                }
                startActivity(intent)
                finish()
            }

        }

        if(layoutResId == R.layout.activity_bags){
            txtBags = findViewById(R.id.txtBags)
            txtBags.setOnClickListener {
//            Toast.makeText(this, "Answer", Toast.LENGTH_LONG).show()
                val intent = Intent(this, MainActivity::class.java).apply {
                    putExtra("layout", R.layout.activity_home)
                }
                startActivity(intent)
                finish()
            }
        }


        if(layoutResId == R.layout.activity_bag1){
            txtBag1 = findViewById(R.id.txtBag1)
            txtBag1.setOnClickListener {
//            Toast.makeText(this, "Answer", Toast.LENGTH_LONG).show()
                val intent = Intent(this, MainActivity::class.java).apply {
                    putExtra("layout", R.layout.activity_bags)
                }
                startActivity(intent)
                finish()
            }
        }


        if(layoutResId == R.layout.activity_hats){
            txtHats = findViewById(R.id.txtHats)
            txtHats.setOnClickListener {
//            Toast.makeText(this, "Answer", Toast.LENGTH_LONG).show()
                val intent = Intent(this, MainActivity::class.java).apply {
                    putExtra("layout", R.layout.activity_home)
                }
                startActivity(intent)
                finish()
            }
        }


        if(layoutResId == R.layout.activity_hat1){
            txtHat1 = findViewById(R.id.txtHat1)
            txtHat1.setOnClickListener {
//            Toast.makeText(this, "Answer", Toast.LENGTH_LONG).show()
                val intent = Intent(this, MainActivity::class.java).apply {
                    putExtra("layout", R.layout.activity_hats)
                }
                startActivity(intent)
                finish()
            }
        }


        if(layoutResId == R.layout.activity_shoes){
            txtShose = findViewById(R.id.txtShose)
            txtShose.setOnClickListener {
//            Toast.makeText(this, "Answer", Toast.LENGTH_LONG).show()
                val intent = Intent(this, MainActivity::class.java).apply {
                    putExtra("layout", R.layout.activity_home)
                }
                startActivity(intent)
                finish()
            }
        }


        if(layoutResId == R.layout.activity_shose1){
            txtShose1 = findViewById(R.id.txtShose1)
            txtShose1.setOnClickListener {
//            Toast.makeText(this, "Answer", Toast.LENGTH_LONG).show()
                val intent = Intent(this, MainActivity::class.java).apply {
                    putExtra("layout", R.layout.activity_shoes)
                }
                startActivity(intent)
                finish()
            }
        }


        if(layoutResId == R.layout.activity_glasses){
            txtglasses = findViewById(R.id.txtglasses)
            txtglasses.setOnClickListener {
//            Toast.makeText(this, "Answer", Toast.LENGTH_LONG).show()
                val intent = Intent(this, MainActivity::class.java).apply {
                    putExtra("layout", R.layout.activity_home)
                }
                startActivity(intent)
                finish()
            }
        }


        if(layoutResId == R.layout.activity_glasses1){
            txtglasses1 = findViewById(R.id.txtglasses1)
            txtglasses1.setOnClickListener {
//            Toast.makeText(this, "Answer", Toast.LENGTH_LONG).show()
                val intent = Intent(this, MainActivity::class.java).apply {
                    putExtra("layout", R.layout.activity_glasses)
                }
                startActivity(intent)
                finish()
            }
        }


    }
}