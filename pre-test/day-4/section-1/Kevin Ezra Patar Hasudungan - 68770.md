1. B
2. A
3. B
4. A
5. B
6. A
7. B
8. B
9. A
10. C

11. Token experation determines how long the token could be used to perform request to the server. Refresh token, as it name stated, is used to refresh the duration of the jwt token, enabling the user to be authenticated longer.

12. Password encryption is important because if not, all the user that has access to the database could see someone password, and they could do many things with it. In Spring, you could use withDefaultPasswordEncoder() method to easily encrypt password, without needing to create custom password encoder.

13. OAuth2 in Spring Boot could be implemented by creating the client side with jQuery, and then create the endpoint for OAuth2. It uses @AuthenticationPrincipal annotations.

14. OAuth2 Authorization is used mainly to secure an app by preventing unauthorized user request. OAuth2 also make more efficient app, because user could authenticate themselves with provided OAuth2 login methods such as Google and Github.

15. CORS is a Http header based mechanism that allows a server to check the resource (port, domain, etc) when doing request. CORS relies on preflight mechanism to check if the targeted resource allow the request. It is important because we could prevent common attack such ddos, spam, etc from unknown resource.

16. In Spring Boot, CORS is implemented in Controller level, enabling it to check CORS in every endpoint by using @CrossOrigin annotations.

17. Session fixation attack is when someone uses someone else's session (session id, jwt, etc), and hijacks it to perform requests. Spring protects is by automatically creates new session or change id when user logs in.

18. Stateful session management is when the server tracks the user's session in the database, while Stateless session management is when the server doesn't store someone's session activity. In spring boot, stateful session could be added manually by adding the repository, store it, and remove it. Stateless session management could be achieved in spring boot by using jwt.

19. Common security pitfalls and how to avoid it:
- SQL injection: use prepared statement, or use spring's @Query annotation to prevent SQL injection.
- CSRF attack: use @CrossOrigin annotations
- Session fixation: use @SessionAttributes annotations to prevent session fixation.
- Cross site scripting: use @HtmlEscape annotations to prevent cross site scripting.

20. Because threats keep evolving, and we also need to keep up with the evolving threats. Some common security audit tools: AlgoSec, Palo Alto network, CheckPoint, etc.