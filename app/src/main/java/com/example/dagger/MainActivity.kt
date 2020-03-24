package com.example.dagger

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.dagger.core.AppObject
import com.example.dagger.dagger_lib.DaggerLibObject
import com.example.dagger.lib.LibObject
import kotlinx.android.synthetic.main.activity_main.*
import javax.inject.Inject

class MainActivity : AppCompatActivity() {

    @Inject
    lateinit var appObject: AppObject

    @Inject
    lateinit var daggerLibObject: DaggerLibObject

    @Inject
    lateinit var libObject: LibObject

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        App.INSTANCE.component.inject(this)

        log.text = """
            appObjectInstance = $appObject
            daggerLibObject = $daggerLibObject
            libObject = $libObject
        """.trimIndent()
    }
}