package com.romance.valentine.data

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import java.net.HttpURLConnection
import java.net.URL

private const val NTFY_TOPIC = "alerts_for_vg_selection"

suspend fun sendSurpriseNotification(choiceLabel: String) {
    withContext(Dispatchers.IO) {
        try {
            val url = URL("https://ntfy.sh/$NTFY_TOPIC")
            val connection = url.openConnection() as HttpURLConnection
            connection.requestMethod = "POST"
            connection.doOutput = true
            connection.setRequestProperty("Content-Type", "text/plain")
            connection.setRequestProperty("Title", "Surprise Selected 🎁")
            val message = "She selected $choiceLabel!"
            connection.outputStream.use { it.write(message.toByteArray()) }
            connection.responseCode
            connection.disconnect()
        } catch (_: Exception) {
            // Silent fail
        }
    }
}
