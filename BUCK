include_defs('//lib/maven.defs')
include_defs('//lib/JGIT_VERSION')

gerrit_plugin(
  name = 'lfs-storage-s3',
  srcs = glob(['src/main/java/**/*.java']),
  resources = glob(['src/main/resources/**/*']),
  deps = [
    '@jgit//org.eclipse.jgit.http.apache:jgit-http-apache',
    '@jgit//org.eclipse.jgit.lfs:jgit-lfs',
    '@jgit//org.eclipse.jgit.lfs.server:jgit-lfs-server',
  ],
  manifest_entries = [
    'Gerrit-PluginName: lfs-storage-s3',
    'Gerrit-Module: com.googlesource.gerrit.plugins.lfs.s3.Module',
    'Gerrit-HttpModule: com.googlesource.gerrit.plugins.lfs.s3.HttpModule',
  ],
)
