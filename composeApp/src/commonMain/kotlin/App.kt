import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import cafe.adriel.voyager.navigator.Navigator
import org.example.geoblinker.ui.screens.auth.LoginScreen
import androidx.compose.ui.graphics.Color

@Composable
fun App() {
    MaterialTheme(
        colorScheme = androidx.compose.material3.darkColorScheme(
            background = Color(0xFF050A18),
            surface = Color(0xFF1A1F2B)
        )
    ) {
        Surface(color = Color(0xFF050A18)) {
            Navigator(LoginScreen())
        }
    }
}
