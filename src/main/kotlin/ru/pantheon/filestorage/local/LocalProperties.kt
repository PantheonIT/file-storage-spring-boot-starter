package ru.pantheon.filestorage.local

import org.springframework.boot.context.properties.ConfigurationProperties

/**
 * Конфигурация пути до ресурсов локального хранилища.
 *
 * @author Oleg Bryzhevatykh
 */
@ConfigurationProperties("storage.local")
open class LocalProperties(
    var path: String = "resources"
)
