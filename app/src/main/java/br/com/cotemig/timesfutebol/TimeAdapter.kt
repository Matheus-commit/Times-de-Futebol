package br.com.cotemig.timesfutebol

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ImageView
import android.widget.TextView
import coil.load

class TimeAdapter (var context: Context, var lista: List<Time>) : BaseAdapter() {



    override fun getCount(): Int {
        return lista.size
    }

    override fun getItem(p0: Int): Any {
        return ""
    }

    override fun getItemId(p0: Int): Long {
        return 0
    }

    override fun getView(p: Int, p1: View?, p2: ViewGroup?): View {

        var view = LayoutInflater.from(context).inflate(R.layout.item_time, null)

        var nome = view.findViewById<TextView>(R.id.nome)
        nome.text = lista[p].nome

        var escudo = view.findViewById<ImageView>(R.id.escudo)
        escudo.load(lista[p].escudo)

        return view

    }
}