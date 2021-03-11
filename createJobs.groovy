pipelineJob('pipelineJob') {
    definition {
        cps {
            script(readFileFromWorkspace('pipelineJob.groovy'))
            sandbox()
        }
    }
}
pipelineJob('demo-job') {
    definition {
        cpsScm {
            scm {
                git {
                    remote {
                        url 'https://github.com/TQ36/demo-app.git'
                    }
                    branch 'master'
                }
            }
        }
    }
}