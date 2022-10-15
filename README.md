# TimesFutebol

## Biblioteca do Coil
Adicione no arquivo build.gradle do módulo app

```kotlin
implementation 'io.coil-kt:coil:1.2.0'
```
 
## Transformando a classe em Serializable

```kotlin

class Time(var nome: String, var escudo: String) : Serializable {

}

```

## Passando Objeto por Parâmetro via putExtra

```kotlin
var intent = Intent(this, DetalheActivity::class.java)
intent.putExtra("time", lista[i])
startActivity(intent)
```

## Obtendo valor na DetalheActivity

```kotlin
var escudo = findViewById<ImageView>(R.id.escudo)
var nome = findViewById<TextView>(R.id.nome)

var time = intent.getSerializableExtra("time") as Time

escudo.load(time.escudo)
nome.text = time.nome
```
