package net.meilcli.implementationtest

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import net.meilcli.implementationtest.lib2.MyClass // [actual] Unresolved reference: lib2

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}
