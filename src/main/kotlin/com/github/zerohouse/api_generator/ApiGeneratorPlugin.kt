package com.github.zerohouse.api_generator

import org.gradle.api.Plugin
import org.gradle.api.Project

class ApiGeneratorPlugin : Plugin<Project> {
    override fun apply(project: Project) {
        // 'generateApi'라는 이름의 태스크를 등록합니다.
        project.tasks.register("generateApi", ApiGeneratorTask::class.java)
    }
}