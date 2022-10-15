package br.com.cotemig.timesfutebol

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import coil.load

class DetalheActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detalhe)

        var escudo = findViewById<ImageView>(R.id.escudo)
        var nome = findViewById<TextView>(R.id.nome)

        var time = intent.getSerializableExtra("time") as Time

        escudo.load(time.escudo)
        nome.text = time.nome

    }
}