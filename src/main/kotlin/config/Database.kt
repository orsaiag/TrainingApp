package config

import org.jooq.impl.DSL
import java.sql.Connection
import java.sql.DriverManager

object Database {
    val connection: Connection = DriverManager.getConnection(
        "jdbc:postgresql://localhost:5432/TrainingApp",
        "postgres",
        "or1234"
    ).apply {
        autoCommit = true
    }

    val sql = DSL.using(connection)
}
