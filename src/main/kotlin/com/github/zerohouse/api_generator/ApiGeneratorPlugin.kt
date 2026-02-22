package com.github.zerohouse.api_generator

import org.gradle.api.Plugin
import org.gradle.api.Project

class ApiGeneratorPlugin : Plugin<Project> {
    override fun apply(project: Project) {
        // 1. Extension 등록 (이게 있어야 tasks { } 밖에서 바로 쓸 수 있음)
        val extension = project.extensions.create("generateApi", ApiGeneratorExtension::class.java)

        // 2. 태스크 등록
        project.tasks.register("generateApi", ApiGeneratorTask::class.java) { task ->
            // Extension의 값을 태스크에 연결
            task.basePackage = extension.basePackage
            task.outputPath = extension.outputPath
        }
    }
}

// 설정을 담을 데이터 클래스
open class ApiGeneratorExtension {
    var basePackage: String = ""
    var outputPath: String = ""
}