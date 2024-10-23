void call {
    String Gitlab


        node ('maps') {
        stage('Lectura Parametros') {
            properties([
                parameters([
                    string(name: 'Url', defaultValue: '', description: 'URL desarrollo'),

                    
                ])
            ])

            Gitlab  = this.params.Url
            Workset = this.params.Workset_PAR2 
 			usercons = env.BUILD_USER_ID
			fecha_inicio = new Date().format("yyyy-MM-dd HH:mm:ss")
			
      }
    }
    stage("Clonar repo"){
            echo "clonando repositorio"
            echo "Repo clonados"
    }  

    stage("Docker"){
        println(Gitlab)
    }


}