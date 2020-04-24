# infy-invoice-svc
## To test this service, below are the endpoint details:
```
POST /invoice HTTP/1.1
Host: localhost:8080
Content-Type: application/json

{
	"customerName":"customerName",
	"customerEmail":"customerEmail@gmail.com",
	"orderId":1
}
```
## Effect of adding spring sleuth on logs:
```
2020-04-13 11:39:46.484 DEBUG [InvoiceService,6c29eb3fe6c1ff76,6c29eb3fe6c1ff76,false] 13720 --- [nio-8080-exec-1] o.s.web.servlet.DispatcherServlet        : POST "/invoice", parameters={}
2020-04-13 11:39:46.613 DEBUG [InvoiceService,6c29eb3fe6c1ff76,6c29eb3fe6c1ff76,false] 13720 --- [nio-8080-exec-1] o.s.web.servlet.DispatcherServlet        : Completed 200 OK
2020-04-13 11:40:08.492 DEBUG [InvoiceService,11895967e32dd2d8,11895967e32dd2d8,false] 13720 --- [nio-8080-exec-2] o.s.web.servlet.DispatcherServlet        : POST "/invoice", parameters={}
2020-04-13 11:40:08.501 DEBUG [InvoiceService,11895967e32dd2d8,11895967e32dd2d8,false] 13720 --- [nio-8080-exec-2] o.s.web.servlet.DispatcherServlet        : Completed 200 OK
```
modified
