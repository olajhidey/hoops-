package com.example.hoops

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast

class GameSettingActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_game_setting)

        val extra = intent.getIntExtra(SelectionActivity.GAMETYPE, 0)

        val message = when(extra) {
            0 -> {
                toastMessage("One-on-one chosen!")
            }
            1-> {
                toastMessage("We playing set..")
            }

            2-> {
                toastMessage("Lets play full court")
            }

            else->{
                toastMessage("Pick a damn selection")
            }
        }

        supportActionBar?.title = "Setup Game"


    }

    private fun toastMessage(message:String) {
        val toast = Toast.makeText(this,message, Toast.LENGTH_SHORT )
        toast.show()
    }
}
