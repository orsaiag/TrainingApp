import com.example.generated.tables.pojos.MembershipTypeForMonth
import java.time.LocalDateTime

class Trainee(
    val id: Long? = null,
    val name: String,
    val phone: String,
    var paymentMethod: PaymentMethod,
    val note: String? = null,
    var membership: MembershipTypeForMonth
)

enum class PaymentMethod {
    BIT,
    PAYBOX,
    CASH
}

enum class TrainingType {
    PILATIS,
    POWER,
    COMBINED
}

class Training(
    val id: Long?,
    val type: TrainingType,
    var maxTrainees: Int = 3,
    val dateTime: LocalDateTime,
    val duration: Int = 60
)