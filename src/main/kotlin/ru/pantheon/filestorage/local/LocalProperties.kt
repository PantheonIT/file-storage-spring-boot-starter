package ru.pantheon.filestorage.local

import org.springframework.boot.context.properties.ConfigurationProperties
import org.springframework.boot.context.properties.ConstructorBinding

/**
 * Конфигурация пути до ресурсов локального хранилища.
 *
 * @author Oleg Bryzhevatykh
 */
@ConstructorBinding
@ConfigurationProperties("storage.local")
open class LocalProperties(
    var path: String = "resources"
)
