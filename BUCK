include_defs('//lib/maven.defs')
include_defs('//lib/JGIT_VERSION')

gerrit_plugin(
  name = 'lfs-storage-s3',
  srcs = glob(['src/main/java/**/*.java']),
  resources = glob(['src/main/resources/**/*']),
  deps = [
    ':jgit-http-apache',
    ':jgit-lfs',
    ':jgit-lfs-server',
  ],
  manifest_entries = [
    'Gerrit-PluginName: lfs-storage-s3',
    'Gerrit-HttpModule: com.googlesource.gerrit.plugins.lfs.s3.HttpModule',
  ],
)

maven_jar(
  name = 'jgit-http-apache',
  id = 'org.eclipse.jgit:org.eclipse.jgit.http.apache:' + VERS,
  sha1 = '4e5ad2c59c05ca9d749ed056e7869213804ebc83',
  license = 'jgit',
  repository = REPO,
  unsign = True,
  exclude = [
    'about.html',
    'plugin.properties',
  ],
)

maven_jar(
  name = 'jgit-lfs',
  id = 'org.eclipse.jgit:org.eclipse.jgit.lfs:' + VERS,
  bin_sha1 = '476f9b2939c24ffa1155ca71bf4a52b3784bcf41',
  src_sha1 = 'b60acd860be76d8a944ab8107b4f53a068a50d2f',
  license = 'jgit',
  repository = REPO,
  unsign = True,
  exclude = [
    'about.html',
    'plugin.properties',
  ],
)

maven_jar(
  name = 'jgit-lfs-server',
  id = 'org.eclipse.jgit:org.eclipse.jgit.lfs.server:' + VERS,
  bin_sha1 = '87a61feef9c69e767a67f3125b1e9a44dbbab3a4',
  src_sha1 = 'cef6a0419d2b0f255a33c82929d94fbe8b2fd3cf',
  license = 'jgit',
  repository = REPO,
  unsign = True,
  exclude = [
    'about.html',
    'plugin.properties',
  ],
)
