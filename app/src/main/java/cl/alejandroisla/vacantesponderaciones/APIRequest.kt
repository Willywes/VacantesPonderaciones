package cl.alejandroisla.vacantesponderaciones

import android.util.Log
import org.json.JSONObject
import java.net.URL

class APIRequest(val url: String) {

    fun run() {

        try {

            val srt = URL(url).readText()
            Log.d("RES", JSONObject(srt).toString())
        } catch (ex: Exception) {
            Log.d("ERROR API REST", ex.message)
        }
    }
}