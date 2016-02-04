gerrit_plugin(
  name = 'lfs-storage-s3',
  srcs = glob(['src/main/java/**/*.java']),
  resources = glob(['src/main/resources/**/*']),
  manifest_entries = [
    'Gerrit-PluginName: lfs-storage-s3',
    'Gerrit-Module: com.googlesource.gerrit.plugins.lfs.s3.Module',
  ],
  provided_deps = [
    '@jgit//org.eclipse.jgit.lfs:jgit-lfs',
    '@jgit//org.eclipse.jgit.lfs.server:jgit-lfs-server',
  ],
)
