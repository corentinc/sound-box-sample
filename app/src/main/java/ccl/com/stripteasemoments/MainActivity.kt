package ccl.com.stripteasemoments

import android.content.res.AssetFileDescriptor
import android.media.MediaPlayer
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.View
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    private val RAW_FOLDER = "raw"
    private val PACKAGE = "ccl.com.stripteasemoments"

    private var songPlayer: MediaPlayer = MediaPlayer()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    /**
     * Play the song associated to the button
     */
    fun launchSong(view: View) {
        if (!songPlayer.isPlaying) {
            val afd = getFileSongFromButton(view)
            songPlayer.reset()
            songPlayer.setDataSource(afd.fileDescriptor, afd.startOffset, afd.declaredLength)
            songPlayer.prepare()
            songPlayer.start()
            Toast.makeText(this, view.tag.toString(), Toast.LENGTH_SHORT).show()
        }
    }

    /**
     * Get the file song associated to the button button
     */
    private fun getFileSongFromButton(button: View): AssetFileDescriptor {
        val id = button.id
        val resourceId = resources.getIdentifier(button.resources.getResourceEntryName(id), RAW_FOLDER, PACKAGE)
        return resources.openRawResourceFd(resourceId)
    }
}
