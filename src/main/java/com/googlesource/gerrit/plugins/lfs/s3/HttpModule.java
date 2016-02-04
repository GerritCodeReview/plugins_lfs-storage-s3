package com.googlesource.gerrit.plugins.lfs.s3;

import static com.google.gerrit.httpd.plugins.LfsPluginServlet.URL_REGEX;

import com.google.gerrit.httpd.plugins.HttpPluginModule;

public class HttpModule extends HttpPluginModule {

  @Override
  protected void configureServlets() {
    serveRegex(URL_REGEX).with(LfsApiServlet.class);
  }
}
