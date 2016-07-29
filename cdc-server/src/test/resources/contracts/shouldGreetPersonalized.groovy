import org.springframework.cloud.contract.spec.Contract

Contract.make {
    request {
        method 'GET'
        urlPath('/personalized') {
            queryParameters {
                parameter 'name' : 'Dilip'
            }
        }
    }
    response {
        status 200
        body("""
    {
      "message":"Hello Dilip!"
    }
    """)
        headers {
            header('Content-Type': 'application/json;charset=UTF-8')
        }
    }
}