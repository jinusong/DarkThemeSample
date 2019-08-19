package com.jinwoo.darkthemesample

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity;
import android.view.Menu
import android.view.MenuItem
import kotlinx.android.synthetic.main.activity_main.*



class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setSupportActionBar(toolbar)

        supportFragmentManager
            .beginTransaction()
            .replace(R.id.content_layout, MainFragment(), "main")
            .commit()
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menu_main, menu) ;
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean = when (item.itemId) {
            R.id.menu_light -> {
                ThemeHelper.applyTheme(ThemeHelper.LIGHT_MODE)
                true
            }
            R.id.menu_dark -> {
                ThemeHelper.applyTheme(ThemeHelper.DARK_MODE)
                true
            }
            R.id.menu_default -> {
                ThemeHelper.applyTheme(ThemeHelper.DEFAULT_MODE)
                true
            }
            else -> super.onOptionsItemSelected(item)
        }
}
