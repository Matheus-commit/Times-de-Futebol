package br.com.cotemig.timesfutebol

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ListView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var lista = ArrayList<Time>()
        lista.add(Time("América", "https://ssl.gstatic.com/onebox/media/sports/logos/ZFsHqGsKNQPlCQjZ4Lu-EQ_48x48.png"))
        lista.add(Time("Atlético PR", "https://ssl.gstatic.com/onebox/media/sports/logos/LtpA9v-CQ_Qs2bgWVdDXxQ_48x48.png"))
        lista.add(Time("Atlético GO", "https://ssl.gstatic.com/onebox/media/sports/logos/9mqMGndwoR9og_Z0uEl2kw_48x48.png"))
        lista.add(Time("Atlético MG", "https://ssl.gstatic.com/onebox/media/sports/logos/q9fhEsgpuyRq58OgmSndcQ_48x48.png"))
        lista.add(Time("Avaí", "https://ssl.gstatic.com/onebox/media/sports/logos/9cwCmoBXGaPJ_Q5cgUeocg_48x48.png"))
        lista.add(Time("Botafogo", "https://ssl.gstatic.com/onebox/media/sports/logos/KLDWYp-H8CAOT9H_JgizRg_48x48.png"))

        var listaTimes = findViewById<ListView>(R.id.listaTimes)
        listaTimes.adapter = TimeAdapter(this, lista)

        listaTimes.setOnItemClickListener { adapterView, view, i, l ->

            var intent = Intent(this, DetalheActivity::class.java)
            intent.putExtra("time", lista[i])
            startActivity(intent)

        }

    }
}