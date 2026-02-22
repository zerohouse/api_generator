package com.github.zerohouse.api_generator

import org.gradle.api.DefaultTask
import org.gradle.api.tasks.Input
import org.gradle.api.tasks.TaskAction

open class ApiGeneratorTask : DefaultTask() {
    @Input var basePackage: String = ""
    @Input var outputPath: String = ""

    @TaskAction
    fun generate() {
        if (basePackage.isEmpty() || outputPath.isEmpty()) {
            throw IllegalArgumentException("basePackage and outputPath must be set")
        }
        ApiGenerator.generate(basePackage, outputPath)
    }
}

