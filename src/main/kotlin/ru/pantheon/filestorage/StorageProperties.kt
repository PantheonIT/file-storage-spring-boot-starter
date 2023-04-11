package ru.pantheon.filestorage

import org.springframework.boot.context.properties.ConfigurationProperties

/**
 * Configuration properties for file storage support.
 *
 * @author Oleg Bryzhevatykh
 */
@ConfigurationProperties(prefix = "storage")
open class StorageProperties {
    /**
     * Current file storage type.
     */
    var type: StorageType = StorageType.LOCAL
}
