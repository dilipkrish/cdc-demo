import org.springframework.cloud.contract.spec.Contract

Contract.make {
    request {
        method 'GET'
        url '/greeting'
    }
    response {
        status 200
        body("""
    {
      "message":"Hello World!"
    }
    """)
        headers {
            header('Content-Type': 'application/json;charset=UTF-8')
        }
    }
}