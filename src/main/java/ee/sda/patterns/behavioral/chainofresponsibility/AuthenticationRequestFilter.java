package ee.sda.patterns.behavioral.chainofresponsibility;

import ee.sda.patterns.behavioral.chainofresponsibility.model.Request;

public class AuthenticationRequestFilter implements RequestFilter {

  private RequestFilter nextFilter;

  @Override
  public void handle(Request request) {
    String authorization = request.getHeaders().get("Authorization");
    if (authorization != null) {
      if (authorization.equals("Bearer 1234567890")) {
        if (nextFilter != null) {
          nextFilter.handle(request);
        }
      }
    }

  }

  @Override
  public void nextFilter(RequestFilter filter) {
    this.nextFilter = filter;
  }

}
