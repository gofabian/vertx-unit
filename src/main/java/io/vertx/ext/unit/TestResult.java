package io.vertx.ext.unit;

import io.vertx.codegen.annotations.VertxGen;

/**
 * The result of a test.
 *
 * @author <a href="mailto:julien@julienviet.com">Julien Viet</a>
 */
@VertxGen
public interface TestResult {

  /**
   * The test description, may be null if none was provided.
   */
  String description();

  /**
   * The test execution time.
   */
  long time();

  /**
   * Did it succeed?
   */
  boolean succeeded();

  /**
   * Did it fail?
   */
  boolean failed();

  /**
   * An exception describing failure, null if the test succeeded.
   */
  Throwable failure();
}
