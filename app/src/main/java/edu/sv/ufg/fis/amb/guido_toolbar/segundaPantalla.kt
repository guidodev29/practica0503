package edu.sv.ufg.fis.amb.guido_toolbar

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Toast
import androidx.appcompat.widget.Toolbar

class segundaPantalla : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_segunda_pantalla)

        var toolbar = findViewById<Toolbar>(R.id.toolbar)
        setSupportActionBar(toolbar)

        supportActionBar?.title = "Hernández Guido"
        supportActionBar?.subtitle = "Universidad Francisco Gavidia"
        supportActionBar?.setIcon(R.drawable.ic_launcher_foreground)

    }

    override fun onSupportNavigateUp(): Boolean {
        finish()
        return true
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.ufg_toolbar, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {

        return when(item.itemId) {
            R.id.configuracion -> {
                Toast.makeText(this, "USTED A SELECCIONADO LA OPCION DE: CONFIGURACION", Toast.LENGTH_SHORT).show()
                true
            }
            R.id.user -> {
                Toast.makeText(this, "USTED A SELECCIONADO LA OPCION DE: PERFIL", Toast.LENGTH_SHORT).show()
                true
            }
            R.id.mapa -> {
                Toast.makeText(this, "USTED A SELECCIONADO LA OPCION DE: UBICACION", Toast.LENGTH_SHORT).show()
                true
            }
            R.id.nueva_cuenta -> {
                Toast.makeText(this, "USTED A SELECCIONADO LA OPCION DE: AGREGAR CUENTA", Toast.LENGTH_SHORT).show()
                true
            }
            R.id.salir -> {
                Toast.makeText(this, "USTED A SELECCIONADO LA OPCION DE: SALIR", Toast.LENGTH_SHORT)
                    .show()
                true
            }
            else -> false
        }
    }
}